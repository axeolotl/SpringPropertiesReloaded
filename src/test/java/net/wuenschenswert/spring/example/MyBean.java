package net.wuenschenswert.spring.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 */
public class MyBean {
  Log log = LogFactory.getLog(MyBean.class);

  int cachesize;

  public int getCachesize() {
    return cachesize;
  }

  public void setCachesize(int cachesize) {
    log.info("cache size set to "+cachesize);
    this.cachesize = cachesize;
  }
}
