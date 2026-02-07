package java8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

//Nashorn is a JavaScript engine built into Java (introduced in Java 8) that allows you to:
//Run JavaScript code inside Java applications.
//It replaced the older Rhino engine.It is depriciated in j 15.
//GraalVM provides a modern JavaScript runtime that integrates with Java via the Polyglot API.It replaces Nashorn.
public class nashOrnEngine {
    public static void main(String[] args) throws ScriptException {
        ScriptEngine se=new ScriptEngineManager().getEngineByName("Nashorn");
        se.eval("Print('Hello from javaScript');");
    }
}
