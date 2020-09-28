package question4; 

public interface Lockable
{
   //-----------------------------------------------------------------
   //  Sets the object's key.
   //-----------------------------------------------------------------
   public void setKey(int key);

   //-----------------------------------------------------------------
   //  Locks the object if the proper key is provided.
   //-----------------------------------------------------------------
   public void lock(int key);

   //-----------------------------------------------------------------
   //  Unlocks the object if the proper key is provided.
   //-----------------------------------------------------------------
   public void unlock(int key);

   //-----------------------------------------------------------------
   //  Returns true it the object is locked, else returns false.
   //-----------------------------------------------------------------
   public boolean locked();
}