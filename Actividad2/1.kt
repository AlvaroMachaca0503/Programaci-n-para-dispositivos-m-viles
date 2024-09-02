
class CuentaBancaria {
    private var saldo: Double = 0.0
    private var limiteRetiro: Double = 1000.0

    fun getSaldo(): Double {
        return saldo
    }

    fun setSaldo(nuevoSaldo: Double) {
        if (nuevoSaldo >= 0) {
            saldo = nuevoSaldo
        } else {
            println("El saldo no puede ser negativo.")
        }
    }

    fun getLimiteRetiro(): Double {
        return limiteRetiro
    }

    fun setLimiteRetiro(nuevoLimite: Double) {
        if (nuevoLimite > 0) {
            limiteRetiro = nuevoLimite
        } else {
            println("El límite de retiro debe ser positivo.")
        }
    }

    fun retirar(cantidad: Double) {
        if (cantidad > saldo) {
            println("Fondos insuficientes.")
        } else if (cantidad > limiteRetiro) {
            println("La cantidad excede el límite de retiro.")
        } else {
            saldo -= cantidad
            println("Retiro exitoso. Saldo restante: $saldo")
        }
    }
}

fun main() {
    val cuenta = CuentaBancaria()
    cuenta.setSaldo(1500.0)
    cuenta.setLimiteRetiro(500.0)
    cuenta.retirar(200.0)
    cuenta.retirar(600.0)
    cuenta.retirar(1000.0)
}
