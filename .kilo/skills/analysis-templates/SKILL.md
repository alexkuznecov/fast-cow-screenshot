---
name: analysis-templates
description: Шаблоны аналитических артефактов проекта fast-cow-screenshot (требования REQ, user stories US, архитектурные решения ADR, исследования RES). Используй при создании или обновлении документов в docs/analysis/.
---
# Шаблоны аналитических артефактов

Шаблоны лежат рядом с этим файлом в папке `templates/`:

| Артефакт | Шаблон | Папка назначения | Имя файла |
|---|---|---|---|
| Требование / спецификация | `templates/requirement.md` | `docs/analysis/requirements/` | `REQ-NNN-<slug>.md` |
| User story | `templates/user-story.md` | `docs/analysis/user-stories/` | `US-NNN-<slug>.md` |
| Архитектурное решение | `templates/adr.md` | `docs/analysis/decisions/` | `ADR-NNN-<slug>.md` |
| Исследование / сравнение | `templates/research.md` | `docs/analysis/research/` | `RES-NNN-<slug>.md` |

## Правила

1. Прочитай нужный шаблон (`.kilo/skills/analysis-templates/templates/<file>`).
2. Определи следующий свободный номер `NNN` по файлам в папке назначения (glob `XXX-*.md`).
3. `<slug>` — короткое имя в kebab-case на латинице (например, `region-capture`).
4. Заполни все разделы; неприменимые разделы помечай «Н/П», а не удаляй.
5. Статусы: `Draft` → `Review` → `Approved` → `Implemented` / `Rejected` / `Superseded`.
6. После создания добавь строку в соответствующую таблицу `docs/analysis/README.md`.
