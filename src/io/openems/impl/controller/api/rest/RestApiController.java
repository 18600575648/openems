package io.openems.impl.controller.api.rest;

import io.openems.api.channel.ConfigChannel;
import io.openems.api.controller.Controller;
import io.openems.api.exception.OpenemsException;
import io.openems.api.thing.ThingDescription;

public class RestApiController extends Controller {

	public static ThingDescription getDescription() {
		return new ThingDescription("REST-API (z. B. f�r externe Datenabfrage)", "");
	}

	public RestApiController() {
		super();
	}

	public RestApiController(String thingId) {
		super(thingId);
	}

	public final ConfigChannel<Integer> port = new ConfigChannel<Integer>("port", this, Integer.class)
			.defaultValue(8084);

	@Override public void run() {
		// Start REST-Api server
		try {
			ComponentSingleton.getComponent(port);
		} catch (OpenemsException e) {
			log.error(e.getMessage() + ": " + e.getCause());
		}
	}
}
