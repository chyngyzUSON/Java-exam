<%@page pageEncoding="UTF-8" %>
<html>
<body>
<h2>Hello World</h2>
<h1>Регистрируйтесь</h1>
    <form action="index.jsp" method="POST">
        <p>Введите имя
            <input type="text" name="name">
        </p>
        <p>Введите год рождения
            <input type="date" name="birth_year">
        </p>
        <p>Ваш гендер
            <select name="gender">
                <option value="male">Мужчина</option>
                <option value="female">Женшина</option>
                <option value="other">Другое</option>
            </select>
        </p>
        <p>
            <input type="submit" name="submit">
        </p>
    </form>
</body>
</html>
