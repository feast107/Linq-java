# Linq-java


## Collaborate with [Manifold](http://manifold.systems/)

<div align=center>
    <img height=100 src="http://manifold.systems/images/logo_white_64px.png"/>
</div>

# Example

In [TestMain.java](./java/src/test/java/TestMain.java)

``` java
List<E> list = new ArrayList<E>() //List<E>
list
    .aggregate(temp,(s,i)->{ System.out.println(i); return list; })
    .distinct()
    .distinctBy(x->x.propMayReduce)
    .orderBy(x->x.comparableProp)
    .orderByDescending(x->x.comparableProp)
    .where(x->x.comparableProp > 3)
    .select(x->x.anotherProp)
    .find(x->x.comparableProp == 3)
    .toMap(x->x.keyProp,x->x.valueProp);
list.all(x->x.comparableProp > 0)
    ? list.any(x->x.comparableProp < 5)
    : list.findIndex(x->x.comparableProp > 5) > 0;
```