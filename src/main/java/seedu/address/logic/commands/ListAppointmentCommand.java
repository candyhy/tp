package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.model.Model.PREDICATE_SHOW_ALL_APPOINTMENTS;

import seedu.address.model.Model;

public class ListAppointmentCommand extends Command {
    public static final String COMMAND_WORD = "list appointment";

    public static final String MESSAGE_SUCCESS = "Listed all appointments";

    public static final String MESSAGE_FAILURE = "No existing appointments available";

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.updateFilteredAppointmentList(PREDICATE_SHOW_ALL_APPOINTMENTS);
        if (!model.hasAppointment()) {
            return new CommandResult(MESSAGE_FAILURE);
        } else {
            return new CommandResult(MESSAGE_SUCCESS);
        }
    }
}
