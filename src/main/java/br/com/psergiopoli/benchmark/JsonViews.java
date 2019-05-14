package br.com.psergiopoli.benchmark;

public class JsonViews {
    public static interface Public {}
    public static interface Private {}
    public static interface All extends Public, Private {}
}