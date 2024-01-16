package com.teranet.rps.learningcollections.workingWithCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MutableHashMapKeys {
    private static class MutableString{
        private String value;
        public String get()
        {
            return value;
        }

        public void set(final String value)
        {
            Objects.requireNonNull(value);
            this.value = value;
        }
        public MutableString(final String value){
            set(value);
        }
        public boolean equals(final Object o)
        {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            final MutableString that = (MutableString) o;

            return value.equals(that.value);
        }

        public int hashCode()
        {
            return value.hashCode();
        }

        public String toString()
        {
            return value;
        }
    }

    public static void main(String[] args) {
        //Example of Broken Map without hash key
        final Map<MutableString,String> brokenMap = new HashMap<>();
        final String value = "Teranet-TRV";
        final MutableString key = new MutableString(value);
        brokenMap.put(key,value);
        System.out.println(brokenMap.get(key));
        key.set("Kerala");
        System.out.println(brokenMap.get(key));
        System.out.println(brokenMap);

    }
}
