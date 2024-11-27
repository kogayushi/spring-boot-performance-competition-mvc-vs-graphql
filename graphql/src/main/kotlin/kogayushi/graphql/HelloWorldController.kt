package kogayushi.graphql

import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class HelloWorldController {
    @QueryMapping
    fun hello(
        @Argument name: String,
    ): HelloWorld = HelloWorld("Hello, $name!")
}
