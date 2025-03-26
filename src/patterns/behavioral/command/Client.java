package patterns.behavioral.command;

public class Client {

    public static void main(String args[]) {
        Remote remote = new Remote();
        ReceiverTV livingRoomTV = new ReceiverTV();

        CommandInterface on = new ReceiverTVOnCommand(livingRoomTV);
        CommandInterface off = new ReceiverTVOffCommand(livingRoomTV);

        remote.setCommands(new CommandInterface[] {on, off});
        remote.executeCommand1();
        remote.executeCommand2();

    }

}
