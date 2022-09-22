package io.github.joeljeremy7.deezpatch.core.testentities;

import io.github.joeljeremy7.deezpatch.core.InstanceProvider;
import java.util.Collection;
import java.util.List;

public class TestInstanceProviders {
  private TestInstanceProviders() {}

  public static InstanceProvider of(Object... instances) {
    return of(List.of(instances));
  }

  public static InstanceProvider of(Collection<?> instances) {
    return clazz -> {
      for (Object instance : instances) {
        if (instance.getClass().equals(clazz)) {
          return instance;
        }
      }

      throw new IllegalStateException("No instance found for class: " + clazz);
    };
  }
}
