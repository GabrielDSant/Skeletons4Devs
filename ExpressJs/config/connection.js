module.exports = () => {
    const config = require('../config/config')();
    const mysql = require("mysql2");
    const connection = mysql.createConnection({
        host: config.host,
        user: config.user,
        password: config.password,
        database: config.database,
    });

    connection.connect();

    return connection;
}
