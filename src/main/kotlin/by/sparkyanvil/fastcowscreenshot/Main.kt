package by.sparkyanvil.fastcowscreenshot

import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger("by.sparkyanvil.fastcowscreenshot.Main")

/** Точка входа. В этой задаче только пишет строку запуска в лог и завершается. */
fun main() {
    log.info("{} {} started, java {}", AppInfo.NAME, AppInfo.VERSION, System.getProperty("java.version"))
}