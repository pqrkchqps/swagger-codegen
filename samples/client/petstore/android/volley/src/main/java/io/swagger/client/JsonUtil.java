package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import io.swagger.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Animal".equalsIgnoreCase(className)) {
      return new TypeToken<List<Animal>>(){}.getType();
    }
    
    if ("Cat".equalsIgnoreCase(className)) {
      return new TypeToken<List<Cat>>(){}.getType();
    }
    
    if ("Category".equalsIgnoreCase(className)) {
      return new TypeToken<List<Category>>(){}.getType();
    }
    
    if ("Dog".equalsIgnoreCase(className)) {
      return new TypeToken<List<Dog>>(){}.getType();
    }
    
    if ("FormatTest".equalsIgnoreCase(className)) {
      return new TypeToken<List<FormatTest>>(){}.getType();
    }
    
    if ("InlineResponse200".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse200>>(){}.getType();
    }
    
    if ("Model200Response".equalsIgnoreCase(className)) {
      return new TypeToken<List<Model200Response>>(){}.getType();
    }
    
    if ("ModelReturn".equalsIgnoreCase(className)) {
      return new TypeToken<List<ModelReturn>>(){}.getType();
    }
    
    if ("Name".equalsIgnoreCase(className)) {
      return new TypeToken<List<Name>>(){}.getType();
    }
    
    if ("Order".equalsIgnoreCase(className)) {
      return new TypeToken<List<Order>>(){}.getType();
    }
    
    if ("Pet".equalsIgnoreCase(className)) {
      return new TypeToken<List<Pet>>(){}.getType();
    }
    
    if ("SpecialModelName".equalsIgnoreCase(className)) {
      return new TypeToken<List<SpecialModelName>>(){}.getType();
    }
    
    if ("Tag".equalsIgnoreCase(className)) {
      return new TypeToken<List<Tag>>(){}.getType();
    }
    
    if ("User".equalsIgnoreCase(className)) {
      return new TypeToken<List<User>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Animal".equalsIgnoreCase(className)) {
      return new TypeToken<Animal>(){}.getType();
    }
    
    if ("Cat".equalsIgnoreCase(className)) {
      return new TypeToken<Cat>(){}.getType();
    }
    
    if ("Category".equalsIgnoreCase(className)) {
      return new TypeToken<Category>(){}.getType();
    }
    
    if ("Dog".equalsIgnoreCase(className)) {
      return new TypeToken<Dog>(){}.getType();
    }
    
    if ("FormatTest".equalsIgnoreCase(className)) {
      return new TypeToken<FormatTest>(){}.getType();
    }
    
    if ("InlineResponse200".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse200>(){}.getType();
    }
    
    if ("Model200Response".equalsIgnoreCase(className)) {
      return new TypeToken<Model200Response>(){}.getType();
    }
    
    if ("ModelReturn".equalsIgnoreCase(className)) {
      return new TypeToken<ModelReturn>(){}.getType();
    }
    
    if ("Name".equalsIgnoreCase(className)) {
      return new TypeToken<Name>(){}.getType();
    }
    
    if ("Order".equalsIgnoreCase(className)) {
      return new TypeToken<Order>(){}.getType();
    }
    
    if ("Pet".equalsIgnoreCase(className)) {
      return new TypeToken<Pet>(){}.getType();
    }
    
    if ("SpecialModelName".equalsIgnoreCase(className)) {
      return new TypeToken<SpecialModelName>(){}.getType();
    }
    
    if ("Tag".equalsIgnoreCase(className)) {
      return new TypeToken<Tag>(){}.getType();
    }
    
    if ("User".equalsIgnoreCase(className)) {
      return new TypeToken<User>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
