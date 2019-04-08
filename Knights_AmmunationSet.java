package com.company;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class Knights_AmmunationSet implements Set<Knights_Amunation> {
    private static final int MAX_CAPACITY = 15;
    private Knights_Amunation knights_ammunation[] = new Knights_Amunation[MAX_CAPACITY];
    private int size = 0;

    @Override
    public int size() {
        return size;
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    @Override
    public boolean contains(Object o) {
        Iterator<Knights_Amunation> knights_ammunationIterator = iterator();
        while (knights_ammunationIterator.hasNext()){
            if(o.equals(knights_ammunationIterator.next())){
                return true;
            }
        }
        return false;
    }
    @Override
    public Iterator<Knights_Amunation> iterator(){
        return new Iterator<>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public Knights_Amunation next() {
                return knights_ammunation[index++];
            }
        };
    }
    @Override
    public Object[] toArray(){
        Iterator<Knights_Amunation>knights_ammunationIterator = iterator();
        Object[]xd =new Object[size];
        int index = 0;
        while(knights_ammunationIterator.hasNext()){
            xd[index++]=knights_ammunationIterator.next();
        }
    return xd;
    }
    public <K> K[] toArray(K[] a){
        if(a.length >= size && a instanceof Knights_Amunation[]){
            for(int i =0;i<a.length;i++){
                try{
                    a[i]=(K) knights_ammunation[i];
                }
                catch (IndexOutOfBoundsException e){
                    a[i]=null;
                }
            }
        }
        else{
            a=(K[])toArray();
        }
    return a;
    }
   @Override
   public boolean add(Knights_Amunation addedTrain) {
       boolean ka = false;
       knights_ammunation[size++] = addedTrain;
       return true;
   }
}