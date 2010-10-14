package net.wuenschenswert.spring;

/**
 */
public interface ReconfigurationAware {
  public void beforeReconfiguration() throws Exception;;
  public void afterReconfiguration() throws Exception;;
}
