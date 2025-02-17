package command;

class turnTVon implements Command {
    Device tv;

    turnTVon(Device tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }
}

class turnTVoff implements Command {
    Device tv;

    void turnTVon(Device tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

}
