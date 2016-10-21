abstract class Persistence
{
	abstract void persist();
}

class FilePersistence extends Persistence
{
	public void persist()
	{
		System.out.println("Data persisted into file");
	}
}

class DataPersistence extends Persistence
{
	public void persist()
	{
		System.out.println("Data persisted into file");
	}
}


class PersistenceFactory
{
	public static Persistence getpersistence()
	{
		return new FilePersistence();
	}
}

public class Client
{
	public static void main(String[] args)
	{
		Persistence p=PersistenceFactory.getpersistence();
		p.persist();
	}
}