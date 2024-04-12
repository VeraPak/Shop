<center>**SOLID**-принципы</center>

***S** - Single Responsibility Principle* (принцип единственной ответственности). Модуль может иметь одну и только одну причину для изменения.

1. Отдельный класс валидации [Validation](https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/ClientService/Validation.java){target="_blank"} исключительно для проверки данных
2. Отдельный класс кошелек приложения, который можно пополнить [Wallet](https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/ClientService/Wallet.java){target="_blank"}
3. Отдельный класс бонусов [Bonuses](https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/ClientService/Bonuses.java){target="_blank"}

***O** - The Open/Closed Principle* (принцип открытости/закрытости). Классы и другие элементы должны быть открыты для расширения, но закрыты для модификации.

1. Класс [ClientAuthorization](https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/ClientService/ClientAuthorization.java){target="_blank"} для авторизации клиента
   ClientAuthorization имеет собственную логику для поиска клиента в БД, без модификации Client.
2. Класс [ClientRegistration](https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/ClientService/ClientRegistration.java){target="_blank"} для регистрации клиента, не модифицируя класс клиента или авторизации
   ClientRegistration реализует принцип Builder для Client(с обязательными email, password, username)

***L** - The Liskov Substitution Principle* (принцип подстановки Лисков). Функции, которые используют базовый тип, должны иметь возможность использовать подтипы базового типа, не зная об этом.
1. Класс [Clothing](https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/ProductServices/ProductCategories/Clothing.java){target="_blank"} наследуемый от [Product](https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/ProductServices/Product.java){target="_blank"} и имплементирующий [Discount](https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/ProductServices/Discount.java){target="_blank"}
2. Класс [HeadPhones](https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/ProductServices/ProductCategories/Headphones.java){target="_blank"} наследуемый от [Electronics](https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/ProductServices/ProductCategories/Electronics.java){target="_blank"}

***I** - The Interface Segregation Principle* (принцип разделения интерфейса). Программные сущности не должны зависеть от методов, которые они не используют.
1. Интерфейсы [PaymentByAppWallet](https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/Order/PaymentWays/PaymentByAppWallet.java){target="_blank"} и [PaymentByBonuses](https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/Order/PaymentWays/PaymentByBonuses.java){target="_blank"}

***D** - The Dependency Inversion Principle* (принцип инверсии зависимостей). Модули верхних уровней не должны зависеть от модулей нижних уровней.
1. Интерфейс [Delivery](https://github.com/VeraPak/Shop/blob/main/src/main/java/org/example/Delivery/Delivery.java){target="_blank"}, который имплементируют классы почтовой или курьерской доставки
