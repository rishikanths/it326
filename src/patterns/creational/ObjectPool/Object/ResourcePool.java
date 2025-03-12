package patterns.creational.ObjectPool.Object;


/**
 * ResoucePool. 
 * You can notice ResourcePool is extendsing ObjectPool with "Resources"
 * In ObjectPool, "T" will be replaced with "Resource"
 */
public class ResourcePool extends ObjectPool<Resource> {
  
    protected Resource create(){
      return new Resource() ; 
    }
  }