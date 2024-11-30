package org.example.prototype;

public interface IPrototype <T extends IPrototype> {

    IPrototype clone();
    IPrototype deepClone();

}
