<?php

require_once (__DIR__ . '/core/crudController.php');

use Psr\Http\Message\ResponseInterface as Response;
use Psr\Http\Message\ServerRequestInterface as Request;
use Psr\Http\Server\RequestHandlerInterface as RequestHandler;
use src\core\crudController;

$app->get('/', function (Request $request, Response $response) {
    return crudController::hello($request, $response);
});

?>