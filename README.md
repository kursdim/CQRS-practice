# CQRS-practice
# Структура БД
Есть три таблицы: users, posts, comments.


###1)

Таблица users состоит из трех полей: id(число) - первичный ключ; nickname(строка); profile_description(строка).
$2)$ Таблица posts состоит из 6 полей: id(число) - первичный ключ; user_id(строка) - id user'а, которому принадлежит пост; number_of_likes(число), number_of_comments(число), geolocation(строка), description(строка).
$3)$ Таблица comments состоит из трех полей: id(число) - первичный ключ, post_id(число) - id поста, к которому относится комментарий, message(строка).
