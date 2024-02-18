"""If the parameter to the make payment method of the CreditCard class
were a negative number, that would have the effect of raising the balance
on the account. Revise the implementation so that it raises a ValueError if
a negative value is sent. "write a method of the credit card class  to make payment"""


def main():
    balance = 1000
    pmt_amount = float(input('enter amount to pay: '))
    remaining_balance = make_payment(pmt_amount, balance)
    print(remaining_balance)


def make_payment(amount: float, balance: float):
    if (amount <= 0):
        raise ValueError('amount has to be position')
    elif (balance - amount < 0):
        raise ValueError('balance cannot be negative')
    else :
        balance = balance - amount
    
    return balance


if __name__ == "__main__":
    main()