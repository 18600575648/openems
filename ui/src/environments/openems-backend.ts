import { Environment } from "../app/shared/type/environment";


export const environment: Environment = {
  production: true,
  debugMode: false,
  url: (location.protocol == "https:" ? "wss" : "ws") +
    "://" + location.hostname + "/" + (location.protocol == "https:" ? "wss" : "ws"),
  backend: "OpenEMS Backend",
};
