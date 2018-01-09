class BankAccount(private var _balance:Double = 0.0) {
    def deposit(value: Int) { _balance += value}
    def withdraw(value: Int) {
        if (_balance - value > 0) {
            _balance -= value
        }
    }
    def balance = _balance
}
