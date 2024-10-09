package com.example.springgrafanapractice

import io.micrometer.core.instrument.Counter
import io.micrometer.core.instrument.MeterRegistry
import java.util.concurrent.atomic.AtomicInteger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

private val logger = LoggerFactory.getLogger(JahniService::class.java)

@Service
class JahniService(
    private val meterRegistry: MeterRegistry,
) {

    private val 수강신청_남은_자리 = AtomicInteger(100)

    fun apply() {
        logger.info("수강신청 요청 받음")
        수강신청_남은_자리.decrementAndGet()

        Counter.builder("jahni.appy")
            .tag("class", javaClass.simpleName)
            .tag("method", "apply")
            .description("수강신청지표")
            .register(meterRegistry).increment()
    }
}