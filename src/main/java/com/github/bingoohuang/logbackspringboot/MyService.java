package com.github.bingoohuang.logbackspringboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MyService {

  public void doStuff(final String value) {
    log.trace("doStuff needed more information - {}", value);
    log.debug("doStuff needed to debug - {}", value);
    log.info("doStuff took input - {}", value);
    log.warn("doStuff needed to warn - {}", value);
    log.error("doStuff encountered an error with value - {}", value);
  }
}
