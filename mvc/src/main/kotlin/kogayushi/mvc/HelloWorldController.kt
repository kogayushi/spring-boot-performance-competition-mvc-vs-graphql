package kogayushi.mvc

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
    @GetMapping("/api/hello/{name}")
    fun hello(
        @PathVariable name: String,
    ): HelloWorld = HelloWorld("Hello, $name!")
}
