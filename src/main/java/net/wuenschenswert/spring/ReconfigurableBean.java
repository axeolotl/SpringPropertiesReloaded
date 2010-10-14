package net.wuenschenswert.spring;

public interface ReconfigurableBean {
  void reloadConfiguration() throws Exception;
}
