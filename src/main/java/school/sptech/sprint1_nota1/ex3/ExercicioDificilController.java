package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {

        if (n <= 0) {
            return new ExercicioDificilResponse(0, 0);
        }

        int a = 1;
        int b = 1;
        int soma = 1;

        if (n == 1) {
            return new ExercicioDificilResponse(1, soma);
        }

        soma += b;
        int enesimo = b;

        for (int i = 3; i <= n; i++) {
            enesimo = a + b;
            soma += enesimo;
            a = b;
            b = enesimo;
        }

        return new ExercicioDificilResponse(enesimo, soma);
    }
}
