package com.example.Data.in.multitier.arch.entity.inheritance.SingleTable;

import jakarta.persistence.Entity;

@Entity
public class Mannequin extends Humanoid {

    private boolean hasHead;
    private MannequinShape mannequinShape;

    enum MannequinShape
    {
        FLAT, MUSCULAR, UNASSUMING;
    }

    public boolean isHasHead() {
        return hasHead;
    }

    public void setHasHead(boolean hasHead) {
        this.hasHead = hasHead;
    }

    public MannequinShape getMannequinShape() {
        return mannequinShape;
    }

    public void setMannequinShape(MannequinShape mannequinShape) {
        this.mannequinShape = mannequinShape;
    }
}
