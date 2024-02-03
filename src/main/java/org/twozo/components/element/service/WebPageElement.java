package org.twozo.components.element.service;

import org.twozo.components.element.finders.ElementFinder;

public interface WebPageElement extends ElementFinder {

    /**
     * Returns an ElementFinder specific to the context of this WebPageElement.
     *
     * @return An ElementFinder instance for further element search within this element.
     */
    ElementFinder find();

    /**
     * Returns an Interactions instance for performing actions on this WebPageElement.
     *
     * @return An Interactions instance for interacting with this element.
     */
    Interactions interact();

    /**
     * Returns an Information instance for retrieving information about this WebPageElement.
     *
     * @return An Information instance for getting information about this element.
     */
    Information inform();
}
