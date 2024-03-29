package io.metadata.registration.archtests;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

import org.junit.runner.RunWith;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = "io.metadata.registration", 
		importOptions = { ImportOption.DoNotIncludeTests.class, ImportOption.DoNotIncludeJars.class })
public class CleanArchitectureTests {

	@ArchTest
	static ArchRule layers_should_respect_clean_architecture_pattern = 
			layeredArchitecture()
				.layer("adapters").definedBy("..adapters..")
				.layer("core").definedBy("..core..")
				.layer("useCases").definedBy("..core.usecases..")
				.layer("domain").definedBy("..core.domain..")
				.layer("infrastructure").definedBy("..infrastructure..")
	
				.whereLayer("adapters").mayNotBeAccessedByAnyLayer()
				.whereLayer("infrastructure").mayOnlyBeAccessedByLayers("adapters")
				.whereLayer("core").mayOnlyBeAccessedByLayers("adapters", "infrastructure");

}
