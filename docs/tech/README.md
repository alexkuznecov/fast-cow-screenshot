# Техническая документация проекта fast-cow-screenshot

Рабочее пространство агентов **Tech** (`.kilo/agent/tech.md`) и **Dev** (`.kilo/agent/dev.md`).

| Этап | Агент | Запуск | Шаблоны |
|---|---|---|---|
| Требования | Analyst | `/analyze <запрос>`, `@analyst` | `.kilo/skills/analysis-templates/templates/` |
| Технические решения, дизайн, задачи | Tech | `/tech <REQ/US/CLR или запрос>`, `@tech` | `.kilo/skills/tech-templates/templates/` |
| Реализация задачи | Dev | `/dev [TASK-NNN]`, `@dev` | `.kilo/skills/dev-workflow/templates/` |

Входные данные — документы Analyst в [docs/analysis/](../analysis/README.md).
Результат — задачи для агента **Dev**: исполнитель читает задачу и [conventions.md](conventions.md).
Если задачи не хватает для реализации, Dev оформляет запрос уточнения (CLR) к Tech, Analyst или пользователю.

## Структура

| Путь | Содержимое | Префикс |
|---|---|---|
| [conventions.md](conventions.md) | Технические соглашения: стек, версии, структура, стиль, сборка, тесты | — |
| [designs/](designs/) | Технические дизайны фич | `TDD-NNN` |
| [tasks/](tasks/) | Задачи для Dev | `TASK-NNN` |
| [clarifications/](clarifications/) | Запросы уточнения от Dev | `CLR-NNN` |
| [../analysis/decisions/](../analysis/decisions/) | Архитектурные и технологические решения (общий реестр с Analyst) | `ADR-NNN` |

## Технические дизайны

| ID | Название | Входные артефакты | Статус |
|---|---|---|---|

## Задачи

Статусы: `Draft` → `Ready` → `In Progress` → `Review` → `Done`; `Blocked` — есть открытый блокирующий CLR.

| ID | Название | TDD | Зависит от | Оценка | Статус |
|---|---|---|---|---|---|

## Порядок выполнения

Задачи выполняются сверху вниз; задача берётся в работу, только когда все её зависимости в статусе `Done`.

Н/П — задач пока нет.

## Запросы уточнения

Статусы: `Open` → `Answered` → `Closed`; `Withdrawn` — вопрос снят.

| ID | Вопрос | Задача | Адресат | Блокирует | Статус |
|---|---|---|---|---|---|
