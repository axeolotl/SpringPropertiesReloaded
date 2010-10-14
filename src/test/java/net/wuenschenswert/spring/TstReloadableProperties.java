package net.wuenschenswert.spring;

import java.util.Properties;

/**
 * makes setProperties public for testing.
 */
public class TstReloadableProperties extends ReloadablePropertiesBase {
  public void setProperties(Properties properties) {
    super.setProperties(properties);
  }
}
