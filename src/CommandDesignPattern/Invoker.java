package CommandDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

private List<iCommand> commands = new ArrayList<>();

public void addCommand(iCommand command)
{
	commands.add(command);
}

public void executeCommands()
{
	for(iCommand c:commands)
	{
		c.execute();
	}
}
}
