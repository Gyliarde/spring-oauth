package br.com.araujo.springoauth

import com.nimbusds.jwt.JWT
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloWorldController {

    @GetMapping("/")

    fun helloWorld(@AuthenticationPrincipal jwt: JWT): String {
        val auth : String = jwt.parsedString
        return auth
    }
}