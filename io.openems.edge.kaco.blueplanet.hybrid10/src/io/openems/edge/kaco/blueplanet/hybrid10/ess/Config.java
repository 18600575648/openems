package io.openems.edge.kaco.blueplanet.hybrid10.ess;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(//
		name = "KACO blueplanet hybrid 10.0 TL3 Ess", //
		description = "Implements the Energy Storage System component for KACO blueplanet hybrid 10.0 TL3")
@interface Config {
	
	@AttributeDefinition(name = "Component-ID", description = "Unique ID of this Component")
	String id() default "ess0";

	@AttributeDefinition(name = "Alias", description = "Human-readable name of this Component; defaults to Component-ID")
	String alias() default "";

	@AttributeDefinition(name = "Is enabled?", description = "Is this Component enabled?")
	boolean enabled() default true;

	@AttributeDefinition(name = "Read-Only mode", description = "In Read-Only mode no set-power-commands are sent to the inverter")
	boolean readOnly() default true;

	@AttributeDefinition(name = "deactivate self regulation", description = "If disabled and Inverter is Connected to Vectis, external regulation might not work properly.")
	boolean selfRegulationDeactivated() default false;

	@AttributeDefinition(name = "Feed surplus power to the Grid", description = "Feeds surplus power to the grid. Only applies if Read-Only mode is deactivated.")
	boolean activateSurplusFeedIn() default true;

	@AttributeDefinition(name = "Core-ID", description = "ID of Core component")
	String core_id() default "kacoCore0";

	@AttributeDefinition(name = "Capacity", description = "The capacity [Wh] of the battery")
	int capacity() default 10_200;

	@AttributeDefinition(name = "Core target filter", description = "This is auto-generated by 'Core-ID'")
	String core_target() default "";

	String webconsole_configurationFactory_nameHint() default "KACO blueplanet hybrid 10.0 TL3 Ess [{id}]";
}
