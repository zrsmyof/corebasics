package com.zrs.custom.enumeration;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zrs
 * <p>
 * Написать аналог Enum (как если бы до Java 1.5) на примере какого-нибудь перечислимого списка, например списка валют.
 * Можно использовать IDE.
 * Нужно:
 * самое важное требование, которое следует удовлетворять в процессе всей реализации - расставить как можно меньшее количество граблей
 * для разработчика, который в будущем будет добавлять новые значения
 * иметь фиксированный список значений, задаваемый на этапе компиялции
 * иметь строгую типизацию значений
 * уметь безопасно сравнивать значения по ==
 * получать все значения
 * иметь неизменяемый ordinal (порядковый номер с 0 в порядке объявления значений)
 * получать значения по ordinal
 * иметь название значения, совпадающее с названием поля для значения
 * искать по имени
 */

public final class CustomEnum {

    public static final Currency USD = new Currency();
    public static final Currency EURO = new Currency();

    static {
        Field[] fields = CustomEnum.class.getFields();
        for (Field f : fields) {
            try {
                if (f.get(null) instanceof Currency) {
                    Currency cur = (Currency) f.get(null);
                    cur.curName = f.getName();
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    private static List<Currency> currencies;

    public static List<Currency> values() {
        return Collections.unmodifiableList(currencies);
    }

    public static Currency valueOf(int ordinal) {
        if (ordinal >= 0 && ordinal < currencies.size()) {
            return currencies.get(ordinal);
        } else {
            return null;
        }
    }

    public static Currency valueOf(String name) {
        return currencies.stream().filter(cur -> cur.curName.equals(name)).findFirst().orElse(null);
    }

    static class Currency {
        private final int ordinal;
        private String curName;

        @Override
        public String toString() {
            return "Currency{" +
                    "ordinal=" + ordinal +
                    ", curName='" + curName + '\'' +
                    '}';
        }

        private Currency() {
            if (currencies == null) {
                currencies = new ArrayList<>();
            }
            this.ordinal = currencies.size();
            currencies.add(this);

        }

        public int getOrdinal() {
            return ordinal;
        }

        public String getCurName() {
            return curName;
        }
    }


}
