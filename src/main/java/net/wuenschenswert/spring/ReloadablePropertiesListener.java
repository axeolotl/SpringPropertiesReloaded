package net.wuenschenswert.spring;

/**
 *
 */
public interface ReloadablePropertiesListener {
  void propertiesReloaded(PropertiesReloadedEvent event);
}
