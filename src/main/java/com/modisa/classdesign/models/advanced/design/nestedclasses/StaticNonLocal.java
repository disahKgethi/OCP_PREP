package com.modisa.classdesign.models.advanced.design.nestedclasses;

public abstract class StaticNonLocal {
    public static class Inner {
        int m_red, m_green, m_blue;

        public Inner() {
            this(0, 0, 0);
        }

        public Inner(int m_red, int m_green, int m_blue) {
            this.m_blue = m_blue;
            this.m_green = m_green;
            this.m_red = m_red;
        }

        @Override
        public String toString() {
            return "Inner{" +
                    "m_red=" + m_red +
                    ", m_green=" + m_green +
                    ", m_blue=" + m_blue +
                    '}';
        }
    }
}
