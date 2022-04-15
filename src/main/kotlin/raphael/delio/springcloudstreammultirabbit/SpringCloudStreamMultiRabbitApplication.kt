package raphael.delio.springcloudstreammultirabbit

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.util.function.Function

@SpringBootApplication
class SpringCloudStreamMultiRabbitApplication {
    @Bean
    fun toUpperCase(): Function<String, String> {
        return Function<String, String> { input ->
            val output = input.uppercase()
            output
        }
    }
}

fun main(args: Array<String>) {
    runApplication<SpringCloudStreamMultiRabbitApplication>(*args)
}
