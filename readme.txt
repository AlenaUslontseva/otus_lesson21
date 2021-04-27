Проект содержит UI-тесты на открытие страниц Отус.

Предполагается запуск тестов в Selenoid под Windows.
Необходимо, чтобы на машине был установлен Docker (приложение Docker Desktop).

Для запуска тестов необходимо запустить приложенный к проекту файл "install.bat":
- скрипт создаст папку C:\users\%USERNAME%\otus21
- скачает в нее Configuration Manager
- запустит через Configuration Manager selenoid
- запустит через Configuration Manager selenoid-ui
После этого тесты доступны для запуска.

Configuration Manager:
- скачает 3 последние версии Chrome,
- с возможностью включить VNC,
- установит лимит в 4 параллельно запущенных образа.

Selenoid-UI доступен по адресу:
http://localhost:8080/ или http://127.0.0.1:8080/

Текущий статус selenoid можно посмотреть по адресу:
http://localhost:4444/status