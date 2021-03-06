package io.liveoak.scripts.libraries.manager;

import java.util.HashMap;
import java.util.Map;

import io.liveoak.scripts.objects.impl.LiveOakClient;
import io.liveoak.spi.client.Client;

/**
 * @author <a href="mailto:mwringe@redhat.com">Matt Wringe</a>
 */
public class LibraryManager {

    Map<String, Library> libraries;

    private static final String CLIENT_NAME = "client";

    public LibraryManager(Client client) {
        LiveOakClient liveOakClient = new LiveOakClient(client);

        String liveOakClientDescription = "Used to communicate and manage other LiveOak resources.";
        Library liveOakLibrary = new Library(CLIENT_NAME, liveOakClientDescription, liveOakClient);

        libraries = new HashMap<>();
        libraries.put(CLIENT_NAME, liveOakLibrary);
    }

    public Library getLibrary(String name) {
        return libraries.get(name);
    }

    public Map<String, Library> getLibraries() {
        return libraries;
    }

}
