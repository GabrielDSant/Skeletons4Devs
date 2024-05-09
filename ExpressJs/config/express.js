const express = require("express");
const bodyParser = require("body-parser");
const config = require("../config/config")();

module.exports = () => {
  const app = express();

  // SETANDO VARIÁVEIS DA APLICAÇÃO
  app.set("port", config.server_port);

  // MIDDLEWARES
  app.use(bodyParser.json());

  require("../api/routes/user")(app);

  return app;
};

//
