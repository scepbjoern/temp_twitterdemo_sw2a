package ch.zhaw.sml.scep.twitterdemo;

import javax.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * JavaDelegate-Klasse, welche einen Tweet auf https://twitter.com/camunda_demo veröffentlicht
 * https://docs.camunda.org/manual/7.7/user-guide/process-engine/delegation-code/#java-delegate
 *
 * @author scep
 */
@Named("sendTweetAdapter")
public class SendTweetDelegate implements JavaDelegate {

    /**
     * Wird aufgerufen bei Aufgabe 'Beispiel-Java-Klasse aufrufen'. Gibt 'Hallo
     * exampleField' zurück, wobei exampleField dem Inhalt der entsprechenden
     * Variable entspricht, welche vom Benutzer im Startformular erfasst wurde.
     *
     * @param execution Zugriff auf das DelegateExecution-Objekt mit z.B. dem
     * aktuellen Variablen-Zustand
     * @throws Exception
     */
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        // Zu sendenden Inhalt festlegen
    }

}
