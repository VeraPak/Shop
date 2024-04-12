<center>**SOLID**-принципы</center>

***S** - Single Responsibility Principle* (принцип единственной ответственности). Модуль может иметь одну и только одну причину для изменения.

1. Отдельный класс валидации <a href="https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/ClientService/Validation.java" target="_blank">Validation</a> исключительно для проверки данных
2. Отдельный класс кошелек приложения, который можно пополнить <a href="https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/ClientService/Wallet.java" target="_blank">Wallet</a>
3. Отдельный класс бонусов <a href="https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/ClientService/Bonuses.java" target="_blank">Bonuses</a>

***O** - The Open/Closed Principle* (принцип открытости/закрытости). Классы и другие элементы должны быть открыты для расширения, но закрыты для модификации.

1. Класс <a href="https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/ClientService/ClientAuthorization.java" target="_blank">ClientAuthorization</a> для авторизации клиента
   ClientAuthorization имеет собственную логику для поиска клиента в БД, без модификации Client.
2. Класс <a href="https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/ClientService/ClientRegistration.java" target="_blank">ClientRegistration</a> для регистрации клиента, не модифицируя класс клиента или авторизации
   ClientRegistration реализует принцип Builder для Client(с обязательными email, password, username)

***L** - The Liskov Substitution Principle* (принцип подстановки Лисков). Функции, которые используют базовый тип, должны иметь возможность использовать подтипы базового типа, не зная об этом.

1. Класс <a href="https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/ProductServices/ProductCategories/Clothing.java" target="_blank">Clothing</a> наследуемый от <a href="https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/ProductServices/Product.java" target="_blank">Product</a> и имплементирующий <a href="https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/ProductServices/Discount.java" target="_blank">Discount</a>
2. Класс <a href="https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/ProductServices/ProductCategories/Headphones.java" target="_blank">HeadPhones</a>
 наследуемый от <a href="https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/ProductServices/ProductCategories/Electronics.java" target="_blank">Electronics</a>

***I** - The Interface Segregation Principle* (принцип разделения интерфейса). Программные сущности не должны зависеть от методов, которые они не используют.
1. Интерфейсы <a href="https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/Order/PaymentWays/PaymentByAppWallet.java" target="_blank">PaymentByAppWallet</a>
 и <a href="https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/Order/PaymentWays/PaymentByBonuses.java" target="_blank">PaymentByBonuses</a>
 
***D** - The Dependency Inversion Principle* (принцип инверсии зависимостей). Модули верхних уровней не должны зависеть от модулей нижних уровней.

1. Интерфейс <a href="https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/Delivery/Delivery.java" target="_blank">Delivery</a>, который имплементируют классы почтовой или курьерской доставки
