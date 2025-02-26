package dio.api_rest.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Home Controller", description = "Endpoints for home operations")
public class HomeController {

    @Operation(summary = "Home endpoint", description = "Returns a welcome message")
    @GetMapping("/")
    public String home() {
        return "Welcome to the API!";
    }
}