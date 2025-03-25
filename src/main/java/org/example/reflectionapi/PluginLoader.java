package org.example.reflectionapi;

import java.lang.reflect.Method;

public class PluginLoader {

    public static void loadAndExecutePlugin(String pluginClassName,int a,int b)throws Exception{
//        load the plugin class dynamically
        Class<?> pluginClass=Class.forName(pluginClassName);

//        check if it implements the Calculator plugin interface
        if (CalculatorPlugin.class.isAssignableFrom(pluginClass)){
//            create an instance of plugin class
            Object pluginInstance=pluginClass.getDeclaredConstructor().newInstance();

//            get the execute method
            Method executeMethod=pluginClass.getMethod("execute",int.class,int.class);

            // Invoke the execute method dynamically
            int result = (int) executeMethod.invoke(pluginInstance, a, b);
            // Output the result
            System.out.println("Result of " + pluginClass.getSimpleName() + ": " + result);
        }else {
            System.out.println("Invalid plugin class");
        }

    }

    public static void main(String[] args) throws Exception {
//        load and execute the addPlugin
        loadAndExecutePlugin("org.example.reflectionapi.AddPlugin",10,20);
        //        load and execute the MultiplyPlugin
        loadAndExecutePlugin("org.example.reflectionapi.MultiplyPlugin",10,20);

    }
}
